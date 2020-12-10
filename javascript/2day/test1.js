console.log('hello world~!');

//한줄주석
/* 여러줄 주석*/

//변수선언
//es6 이전
var name = '홍길동';
console.log(name);

//es6 이후
let x = 10;
let y = 20;
console.log(x+y);

//상수 => 초기에 할당된 값이 변하지 않음
const z = 30;

//함수선언문
//호이스팅 : 함수선언문을 위로 끌어울림.
let result = sum(x,y);
console.log(result);
function sum(a,b) {
  let result;
  result = a + b;
  return result;
}

//함수표현식
//호이스팅 안됨.

let result2 = function(a,b) {
  let result;
  result = a + b;
  return result;
}
console.log(result2(x,y));

//배열생성 2가지 방법
const array = [1,2,3,4,5];
const array2 = new Array(1,2,3,4,5);
console.log(array.toString);
console.log(array2.toString);

//js에서 배열은 동적으로 요소추가 가능
array[5] = 6;
console.log(array.toString());
console.log(array.length);
array.length = 3;
console.log(array.toString());
array.length = 10;
console.log(array.toString());
array[7] = 8;
console.log(array.toString);

//빈배열 생성
array3 = [];
array4 = new Array();
array3[0] = 1;
array3[1] = 2;
array3[2] = 3;
console.log(array3.toString());
array3[5] = 6;
console.log(array3.toString());
console.log(array3.length);
// array3 = ['a','b','c'];

//객체 생성
//1)리터럴 표현식
const person = {
  name: '콩가루',
  age : 2,
  eat: function() {
    console.log('먹다');
  },
  smile: function() {
    console.log('웃다');
  }
};
console.log(person.name);
console.log(person.age);
person.eat();
person.smile();
person.bloodType = 'A';
console.log(person);

//2) new Object()로 객체 생성
const person2 = new Object();
person2.name = '연탄재';
person2.age = 3;
person2.smile = function() {
  console.log('웃다');
}
person2.eat = function() {
  console.log('먹다');
}
console.log(person2);
person2.eat();
person2.smile();

//3) {} 빈객체 생성
const person3 = {};
person3.name = '뚱띵';
person3.age = 4,
person3.smile = function() {
  console.log('웃다');
}
person3.eat = function() {
  console.log('먹다');
}
console.log(person3);

//4) 생성자 함수 : 동일 타입의 인스턴스를 여러개 생성할 때 사용.
//                모양은 똑같지만 앞머리글자가 대문자다. 
function Person(name, age) {
  this.name = name;
  this.age = age;
  this.smile = function() {
    console.log('웃다');
  };
  this.eat = function() {
    console.log('먹다');
  };
}
const person10 = new Person('먹쪼재', 4);
const person11 = new Person('도봉이', 1);
const person12 = new Person('키키', 7);
console.log(person10);
console.log(person11);
console.log(person12);

//5) class : 생성자함수의 syntax sugar(설탕문법)
//   ES6에서는 자바의 클래스를 선언하듯이 쓸 수 있음.
class Person20 {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  //메서드
  smile() {
    console.log('웃다');
  }
  eat() {
    console.log('먹다');
  }
}
const person30 = new Person20('홍길동', 10);
const person31 = new Person20('홍길서', 20);
const person32 = new Person20('홍길남', 30);
console.log(person30);
console.log(person31);
console.log(person32);
console.log(person30.smile());
console.log(person30.eat());