'use strict';


const $edu = document.getElementById('edu');
const $btn = document.getElementsByClassName("btn")[0];
const $btn2 = document.getElementsByClassName("btn2")[0];


$btn.addEventListener("click", function() {
  console.log("버튼 클릭됨");
  $edu.style.backgroundColor = "blue";
  $edu.style.fontSize = "2em";
  $edu.style.color = "white";
});

$btn2.addEventListener("click",function() {
  $edu.innerHTML = document.getElementById('contents').value;
  
});

// console.log($edu.parentElement);
// console.log($edu.nextElementSibling);
// console.log($btn.parentElement);
// console.log($btn.previousElementSibling);

// console.log($btn.parentElement.parentElement);

// const childrenOfbody = document.getElementsByTagName('body')[0].children;
// for(let i=0; i<childrenOfbody.length; i++) {
//   childrenOfbody[i].style.backgroundColor = "#333";
// }