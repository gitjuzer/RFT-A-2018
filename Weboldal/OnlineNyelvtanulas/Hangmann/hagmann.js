var words = new Array(
    "GO", "OF", "ME", "HE", "ON", "IT",
    "CAR", "DOG", "BAD", "BUS", "PEN", "CAT", "ARM", "LEG", "BAG",
    "BOOK", "NOTE", "BOMB", "LAZY", "JEEP", "AQUA", "SIZE", "GOOD", "BACK", "LION",
    "ARMOR", "HOTEL", "ADULT", "LAUGH", "PLANE", "BREAD", "BEACH", "ZEBRA", "WHEEL",
    "ANIMAL", "BEAUTY", "BREATH", "ATTACK", "MIDDLE", "DOLLAR", "DRIVER", "ENERGY", "FRIEND", "LETTER", "MOBILE", "NATURE",
    "KICKBOXING", "COMPLEXITY", "CIVILIZERS", "POCKETBOOK");
var randomWord =  words[Math.floor(Math.random() * words.length)];

// globals
var lifes = 10;
var s;
var count = 0;

// empty arra to store the guesses
var answerArray = [];
var wrongLetters = [];

// loadup answerArray with under scores
function startUp() {
    for (var i = 0; i < randomWord.length; i++) {
        answerArray[i] = "_";
    }
    s = answerArray.join(" ");
    document.getElementById("answer").innerHTML = s;
}

function Letter(letter) {


    if (letter.length > 0) {
        for (var i = 0; i < randomWord.length; i++) {

            if (randomWord[i] == letter) {
                answerArray[i] = letter;
            }
          
            if (Contains(letter, wrongLetters) == false) {
                wrongLetters.push(letter);

            }
        }
        if(Contains(letter,answerArray)==false){
            lifes--;
            draw(lifes);
        }
        count++;
        document.getElementById("counter").innerHTML = "Eddig felhasznált betűk száma: " + count;
        document.getElementById("answer").innerHTML = answerArray.join(" ");
        document.getElementById("wrongletters").innerHTML = "Már felhasznált betűk: " + wrongLetters.join(" ");
        if (lifes == 1) {
            document.getElementById("stat").innerHTML = "Vigyázz már csak 1 életed maradt!";
        }
       
    }
}

function Contains(letter, array) {
    for (var i = 0; i < array.length; i++) {
        if (letter == array[i]) {
            return true;
        }
    }
    return false;
}
function draw(_numberOfLifes) {
    var canvas = document.getElementById("hagmannCanvas");
    var ctx = canvas.getContext("2d");
    ctx.strokeStyle = '#3D1600';
    ctx.lineWidth = 4;
    ctx.beginPath();

    if (_numberOfLifes == 9) {
        //bottom
        ctx.moveTo(20, 140);
        ctx.lineTo(280, 140);
        ctx.stroke();
    }
    else if (_numberOfLifes == 8) {
        //height
        ctx.moveTo(40, 140);
        ctx.lineTo(40, 30);
        ctx.stroke();
    }
    else if (_numberOfLifes == 7) {
        //top
        ctx.moveTo(30, 30);
        ctx.lineTo(150, 30);
        ctx.stroke();
    }
    else if (_numberOfLifes == 6) {
        //bowknot
        ctx.moveTo(150, 28);
        ctx.lineTo(150, 58);
        ctx.stroke();
    }
    else if (_numberOfLifes == 5) {
        //head
        ctx.arc(150, 68, 10, 1.5 * Math.PI, 4 * Math.PI);
        ctx.stroke();
    }
    else if (_numberOfLifes == 4) {
        //body
        ctx.moveTo(150, 78);
        ctx.lineTo(150, 108);
        ctx.stroke();
    }
    else if (_numberOfLifes == 3) {
        //hands, left hand
        ctx.moveTo(150, 88);
        ctx.lineTo(120, 78);
        ctx.stroke();
    }
    else if (_numberOfLifes == 2) {
        //right hand
        ctx.moveTo(150, 88);
        ctx.lineTo(180, 78);
        ctx.stroke();
    }
    else if (_numberOfLifes == 1) {
        // left leg
        ctx.moveTo(150, 108);
        ctx.lineTo(120, 118);
        ctx.stroke();
    }
    else if (_numberOfLifes == 0) {
        //right leg
        ctx.moveTo(150, 108);
        ctx.lineTo(180, 118);
        ctx.stroke();
    }

    /*
        //height
        ctx.moveTo(40, 140);
        ctx.lineTo(40, 30);
        ctx.stroke();
    
        //top
        ctx.moveTo(30, 30);
        ctx.lineTo(150, 30);
        ctx.stroke();
    
        
    
        //head
        ctx.arc(150, 68, 10, 1.5 * Math.PI, 4 * Math.PI);
        ctx.stroke();
    
        //body
        ctx.moveTo(150, 78);
        ctx.lineTo(150, 108);
        ctx.stroke();
    
        //hands, left hand
        ctx.lineWidth = 4
        ctx.moveTo(150,88);
        ctx.lineTo(120,78);
        ctx.stroke();

        //right hand
        ctx.moveTo(150,88);
        ctx.lineTo(180,78);
        ctx.stroke();
    
        //legs, left leg
        ctx.moveTo(150,108);
        ctx.lineTo(120,118);
        ctx.stroke();
        //right leg
        ctx.moveTo(150,108);
        ctx.lineTo(180,118);
        ctx.stroke();
    */
}