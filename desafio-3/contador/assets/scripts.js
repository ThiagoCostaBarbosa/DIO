let count = 0;

const CURRENT_NUMBER = document.getElementById('currentNumber');

const decrement = document.getElementById("decrement");
decrement.addEventListener("click", decrementNumber);

const increment = document.getElementById("increment");
increment.addEventListener("click", incrementNumber);


function incrementNumber(){

  if (count < 10) {
    count++;
	  CURRENT_NUMBER.innerHTML = count;
  } else {
    alert("Contador com número máximo: 10");
  }
  
  if(count >= 0) {
    CURRENT_NUMBER.style.color = "black";
  }
	
}

function decrementNumber() {

  count--;

  CURRENT_NUMBER.innerHTML = count;

  if (count < 0) {
    CURRENT_NUMBER.style.color = "red";
  }

}
