'use strict';

const text = "Web Programming";
let result = text.length;
result = text[2]; //문자열을 배열처럼 사용 할 수 있다.
result = text.split(" "); //split() 괄호 안을 기준으로 나눠서 배열
// result = text.split(" ",3); //split() 괄호 안을 기준으로 나눠서 3개만 배열
// result = text.split(" ").length; //split()로 나눈 배열의 길이를 보여줌

result = text.replace("Web", "HTML5"); // 콜론, 를 기준으로 앞이 바꿀 string
                                      // 뒤가 대체할 string
result  = text.charAt(4); //반환할 열의 위치에 있는 char
console.log(result);

console.log(Math.floor(Math.random()*10)+1);