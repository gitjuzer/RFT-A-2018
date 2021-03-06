<?php
session_start();
?>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="../css/indexStyle.css">
    <script src="script.js"></script>
    <style type="text/css">

        * {

        }
        body{
            background-image: url("https://images.pexels.com/photos/743986/pexels-photo-743986.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
            background-size: 100%;
        }
        .jatek {

            position: absolute;
            top: 50%;
            left: 50%;
            transform: translateX(-50%) translateY(-50%);
            text-align: center;
        }

        h1 {

        }
        .image {
            max-width: 800px;
            max-height: 300px;

        }

        h2 {

        }
    </style>
</head>

<body>
<header>
    <div class="container">
        <div id="branding">
            <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
        </div>
        <nav>
            <ul>
                <li class="current"><a href="../kezdolap.php">Kezdőlap</a></li>
                <li><a href="../gallery.php">Galéria</a></li>
                <li><a href="../DowloadPage/index.php">Letöltés</a></li>
                <li><a href="../reg.php">Regisztráció</a></li>
                <li>
                    <?php
                        if($_SESSION['logged']==true)
                        {
                            echo "Szia ";
                            echo $_SESSION["username"];
                            echo "! ";
                            echo '<a href="../logout.php"><span>Kilépés</span></a></li>';
                }
                elseif($_SESSION['logged']==false)
                {

                echo '<a href="../login.php"><span>Belépés</span></a></li>';
                }
                ?></li>
            </ul>
        </nav>
    </div>
</header>
<div class="jatek">
<img src="https://www.marbellaspanish.com/wp-content/uploads/2018/03/learn-english-at-marbella-international-spanish-school-marbella.jpg" class="image" >

<div id="chooseDifficulty" style="display: block">

    <h1></h1>
    <h5>Válasz nehézséget</h5>
    <button title="very easy" onclick="chooseDif1()">Könnyű</button>
    <button title="not difficult" onclick="chooseDif2()">Közepes</button>
    <button title="a challenge" onclick="chooseDif3()">Nehéz</button>

</div>

<!--not active yet :(-->
<!--<div id="chooseTheme" style="display: none">

    <h1>Guess a Word</h1>
    <h5>Choose a Theme</h5>
    <button onclick="chooseTheme1()">random</button>
    <button onclick="chooseTheme2()">2</button>
    <button onclick="chooseTheme3()">3</button>

</div>-->

<div id="startButton" style="display: none">

    <h1>Találd ki a szót</h1>
    <button onclick="start()">Kezdés</button>

</div>

<div id="mainGame" style="display: none">

    <p id="question"></p>

    <input type="text" id="guess" maxlength="1">

    <div>
        <button onclick="enterGuess()">Tipp</button>
    </div>

</div>

<div id="RRguess" style="display: block">

    <p id="rightGuess"></p>
    <p id="wrongGuess"></p>
    <p id="guessesLeft"></p>

</div>

<div id="youLose" style="display: none">

    <h1>You Lose</h1>

    <div>
        <button onclick="restart()">Új játék?</button>
    </div>

    <p id="correctWordWas"></p>

</div>

<div id="youWin" style="display: none">

    <h2>Nyertél</h2>

    <div>
        <button onclick="restart()">Új játék?</button>
    </div>

</div>

<script>

    var word = "";
    var wordGuess = [];
    var wrongGuess = [];
    var guessBomb = 0;
    var winCount = 1;
    var guess = "";
    var dif = 0;

    function chooseDif1() {
        dif = 1;
        document.getElementById('startButton').style.display = 'block';
        document.getElementById('chooseDifficulty').style.display = 'none';
    }

    function chooseDif2() {
        dif = 2;
        document.getElementById('startButton').style.display = 'block';
        document.getElementById('chooseDifficulty').style.display = 'none';
    }

    function chooseDif3() {
        dif = 3;
        document.getElementById('startButton').style.display = 'block';
        document.getElementById('chooseDifficulty').style.display = 'none';
    }


    function wordw() {
        var randomWords = ["apple", "table", "chair", "Minecraft", "random", "risk", "car", "tree",  "holiday",
        ];

        var img = document.querySelector('.image');

        var raNum = Math.floor(Math.random() * 9);
          img.src= images[raNum];
        return randomWords[raNum]
    }

    var images=['https://images.unsplash.com/photo-1513677785800-9df79ae4b10b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1520869578617-557561d7b114?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80',
    'https://images.unsplash.com/photo-1503602642458-232111445657?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1524685794168-52985e79c1f8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1518688248740-7c31f1a945c4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80',
    'https://images.unsplash.com/photo-1531964714722-c71126c62568?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1503736334956-4c8f8e92946d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1520454974749-611b7248ffdb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60',
    'https://images.unsplash.com/photo-1527179528411-4219e0714bcc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60'];


    function wordStart() {
        var wordLength = word.length;
        var wordL_ = "";
        var count = wordLength;

        while (count > 0) {
            wordGuess.push(" _ ");
            count -= 1;
        }
    }

    function winCountFunc() {
        var num = 0;
        var lettUsed = "";
        var count = word.length;

        while (count > 0) {
            if (lettUsed.includes(word[count - 1])) {

            } else {
                num += 1;
                lettUsed += word[count - 1];
            }

            count -= 1;
        }

        return num;
    }

    function start() {
        word = wordw();
        winCount = winCountFunc();

        if (dif == 1) {
            guessBomb = word.length + 5;
        } else if (dif == 2) {
            guessBomb = word.length;
        } else if (dif == 3) {
            if (word.length % 2 == 0) {
                guessBomb = word.length / 2;
            } else {
                guessBomb = (word.length - 1) / 2;
            }
        }

        console.log(word);
        document.getElementById('mainGame').style.display = 'block';
        document.getElementById('startButton').style.display = 'none';

        document.getElementById("question").innerHTML = "Első tipp";

        wordStart();

        document.getElementById('RRguess').style.display = 'block';
        document.getElementById("rightGuess").innerHTML = "Folyamat: " + wordGuess;
        document.getElementById("wrongGuess").innerHTML = "Rossz tippek: " + wrongGuess;
        document.getElementById("guessesLeft").innerHTML = "Tippek hátra: " + guessBomb;

        var x = document.getElementById("guess").maxLength;
        //document.getElementById("demo").innerHTML = x;
    }

    function enterGuess() {
        var lett = document.getElementById("guess").value;
        document.getElementById("guess").value = "";

        if (lett.length === 1) {
            var rightOnot = isRightOnot(lett);
            if (rightOnot == true) {

                NewCW(lett);
            } else {
                if (!wrongGuess.includes(lett)) {
                    console.log("hi");
                    wrongGuess.push(lett);
                }
                guessBomb -= 1;
            }
        } else if (lett.length < 1) {

        } else {
            guessBomb -= 1;
        }

        if (guessBomb <= 0) {
            gameLose()
        }

        if (winCount <= 0) {
            gameWin()
            var img = document.querySelector('.image');
            img.src = 'https://www.marbellaspanish.com/wp-content/uploads/2018/03/learn-english-at-marbella-international-spanish-school-marbella.jpg';
        }
        document.getElementById("rightGuess").innerHTML = "Folyamatban: " + wordGuess;
        document.getElementById("wrongGuess").innerHTML = "Rossz tippek: " + wrongGuess;
        document.getElementById("guessesLeft").innerHTML = "Tippek hátra: " + guessBomb;
    }

    function isRightOnot(a) {
        var n = word.includes(a);
        return n;
    }

    function NewCW(letter) {
        var count = 0;
        winCount -= 1

        while (count <= word.length - 1) {
            if (letter === word[count]) {
                if (wordGuess[count] === letter) {
                } else {
                }

                wordGuess[count] = letter;
                count += 1;
            } else {
                count += 1;
            }

        }

    }

    function gameLose() {
        document.getElementById('mainGame').style.display = 'none';
        document.getElementById('RRguess').style.display = 'none';
        document.getElementById('youLose').style.display = 'block';
        document.getElementById("correctWordWas").innerHTML = "The correct word was " + word;
    }

    function gameWin() {
        document.getElementById('mainGame').style.display = 'none';
        document.getElementById('RRguess').style.display = 'none';
        document.getElementById('youWin').style.display = 'block';
    }

    function restart() {
        document.getElementById('mainGame').style.display = 'none';
        document.getElementById('RRguess').style.display = 'none';
        document.getElementById('youLose').style.display = 'none';
        document.getElementById('youWin').style.display = 'none';
        document.getElementById('chooseDifficulty').style.display = 'block';

        word = "";
        wordGuess = [];
        wrongGuess = [];
        guessBomb = 0;
        winCount = 1;
        guess = "";
        dif = 0;
    }
</script>
</div>
</body>

</html>