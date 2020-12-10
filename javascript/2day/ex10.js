const box = new Object();
  box.color = "red";
  box.size = 10;
  box.amount = 0;
  box.fill = function() {
    this.amount += 2;
  }
  box.consume = function() {
    this.amount -= 2;
  }

box.fill();
console.log(box.amount);
box.consume();
console.log(box.amount);