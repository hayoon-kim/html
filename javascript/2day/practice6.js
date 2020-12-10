'use strict';

const str = prompt('문자열 입력(&:구분자 사용)');

if(str.indexOf('&') != -1) {
  flag = true;
  const array = str.split('&');
  for(let i=0; i<array.length; i++) {
    console.log(array[i]);
    }
} else {
  alert (''&'을 포함한 문자열을 입력하세요!')
}