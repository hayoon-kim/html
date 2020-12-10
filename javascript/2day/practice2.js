'use strict';

const array = new Array(5);

let i = 0;
while(i < array.length) {
  let tmp = prompt('임의의 정수를 입력하세요');

  //정수가 아닌 입력값은 출력 X
  if( !isNaN(parseInt(tmp))) {
   array[i++] = tmp; 
  } else {
    alert('정수를 입력하세요!');
  }
}
console.log(array);
console.log(array.reverse());