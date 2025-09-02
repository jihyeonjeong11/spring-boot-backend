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

import van from "vanjs-core";

const { button, div, pre } = van.tags;

const sleep = (ms: number) => new Promise((resolve) => setTimeout(resolve, ms));

const Run = ({ sleepMs }: { sleepMs: number }) => {
  const steps = van.state(0);
  (async () => {
    for (; steps.val < 40; ++steps.val) await sleep(sleepMs);
  })();
  return pre(
    () =>
      `${" ".repeat(40 - steps.val)}🚐💨Hello VanJS!${"_".repeat(steps.val)}`
  );
};

const Hello = () => {
  const dom = div();
  return div(
    dom,
    button({ onclick: () => van.add(dom, Run({ sleepMs: 2000 })) }, "Hello 🐌"),
    button({ onclick: () => van.add(dom, Run({ sleepMs: 500 })) }, "Hello 🐢"),
    button({ onclick: () => van.add(dom, Run({ sleepMs: 100 })) }, "Hello 🚶‍♂️"),
    button({ onclick: () => van.add(dom, Run({ sleepMs: 10 })) }, "Hello 🏎️"),
    button({ onclick: () => van.add(dom, Run({ sleepMs: 2 })) }, "Hello 🚀")
  );
};

van.add(document.body, Hello());
