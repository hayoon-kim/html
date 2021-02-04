'use strict';

const $toggleBtn = document.querySelector('.toggleBtn');
const $navbar = document.getElementById('navbar');

$toggleBtn.addEventListener('click', ()=>{
    $toggleBtn.classList.toggle('active');
    $navbar.classList.toggle('active');
})

