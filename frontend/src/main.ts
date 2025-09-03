// import './style.css'
// import typescriptLogo from './typescript.svg'
// import viteLogo from '/vite.svg'
// import { setupCounter } from './counter.ts'

// document.querySelector<HTMLDivElement>('#app')!.innerHTML = `
//   <div>
//     <a href="https://vite.dev" target="_blank">
//       <img src="${viteLogo}" class="logo" alt="Vite logo" />
//     </a>
//     <a href="https://www.typescriptlang.org/" target="_blank">
//       <img src="${typescriptLogo}" class="logo vanilla" alt="TypeScript logo" />
//     </a>
//     <h1>Vite + TypeScript</h1>
//     <div class="card">
//       <button id="counter" type="button"></button>
//     </div>
//     <p class="read-the-docs">
//       Click on the Vite and TypeScript logos to learn more
//     </p>
//   </div>
// `

// setupCounter(document.querySelector<HTMLButtonElement>('#counter')!)

// import van from "vanjs-core";

// const { button, div, form, input, p } = van.tags;

// const nameState = van.state("");
// const emailState = van.state("");
// const messageState = van.state("");

// const App = () => {
//   const handleSubmit = (e: FormDataEvent) => {
//     e.preventDefault();
//     messageState.val = `안녕하세요, ${nameState.val}님!`;
//   };

//   return div(
//     form(
//       { onsubmit: handleSubmit },
//       p("이름을 입력해주세요:"),
//       input({
//         type: "text",
//         oninput: (e) => (nameState.val = e.target.value),
//         placeholder: "여기에 이름을 입력하세요",
//       }),
//       p("이메일을 입력해주세요:"),
//       input({
//         type: "text",
//         oninput: (e) => (emailState.val = e.target.value),
//         placeholder: "여기에 이메일을 입력하세요",
//       }),
//       button({ type: "submit" }, "제출")
//     ),
//     p(messageState)
//   );
// };

// //van.add(document.body, App());

const ENDPOINT_JAVA_MYBATIS = "http://localhost:8080/";

const form = document.getElementById("form-join") as HTMLFormElement;
const username = document.getElementById("username") as HTMLInputElement;
const email = document.getElementById("email") as HTMLInputElement;
const userListUl = document.getElementById("user-list-ul") as HTMLUListElement;

document.addEventListener("DOMContentLoaded", async () => {
  const usersRes = await fetch(ENDPOINT_JAVA_MYBATIS + "users");
  const users = await usersRes.json();

  userListUl.innerHTML = "";

  users.forEach((user) => {
    const li = document.createElement("li");
    li.textContent = `name: ${user.name}, email: ${user.email}`;
    userListUl.appendChild(li);
  });
});

form.addEventListener("submit", async (e) => {
  e.preventDefault();
  try {
    const data = { name: username.value, email: email.value };
    console.log("hello", e);
    const res = await fetch(ENDPOINT_JAVA_MYBATIS + "users", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });
    if (res.ok) {
      const usersRes = await fetch(ENDPOINT_JAVA_MYBATIS + "users");
      const users = await usersRes.json();

      userListUl.innerHTML = "";

      users.forEach((user) => {
        const li = document.createElement("li");
        li.textContent = `이름: ${user.name}, 이메일: ${user.email}`;
        userListUl.appendChild(li);
      });

      username.value = "";
      email.value = "";
    } else {
      console.error("failed", res.status);
    }
  } catch (e) {
    console.error(e);
  }
});
