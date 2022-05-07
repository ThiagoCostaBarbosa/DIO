const cards = document.querySelectorAll(".card");
let [hasFlippedCard, lockBoard] = [false, false];
let firstCard, secondCard;

function flipCard() {

    if (lockBoard || this === firstCard) return;

    this.classList.add("flip");

    if (!hasFlippedCard) {

        hasFlippedCard = true;
        firstCard = this;

    } else {

        secondCard = this;
        hasFlippedCard = false;
        checkForMatch();

    }

}

function checkForMatch() {

    if (firstCard.dataset.card === secondCard.dataset.card) {

        disableCards();

    } else {

        unflipCards();

    }

}

function disableCards() {

    firstCard.removeEventListener("click", flipCard);
    secondCard.removeEventListener("click", flipCard);
    resetBoard();
}

//funcão que desvira as cartas
function unflipCards() {

    lockBoard = true;

    setTimeout(() => {

        firstCard.classList.remove("flip");
        secondCard.classList.remove("flip");
        resetBoard();

    }, 1500);

}

//função que reseta o tabuleiro
function resetBoard() {

    [hasFlippedCard, lockBoard] = [false, false];
    [firstCard, secondCard] = [null, null];

}

//função que embaralha as cartas
(function shuffle() {

    cards.forEach((card) => {

        let ramdomPosition = Math.floor(Math.random() * 12);
        card.style.order = ramdomPosition;

    });

})();

cards.forEach((card) => {

    card.addEventListener("click", flipCard);

});
