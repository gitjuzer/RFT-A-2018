const { createStore } = Redux;
const { Provider, connect } = ReactRedux;
const Component = React.Component;
const { default : styled } = styled;
const { render } = ReactDOM;

let data = [
    {
        id: 0,
        question: 'What has a face and two hands but no arms or legs?\n',
        answers: [
            {
                choice: 0,
                value: 'A clock'
            },
            {
                choice: 1,
                value: 'A person'
            }
        ],
        correctAnswer: 0,
        explanation: 'Az óránál angolul a mutató = hands.'
    },
    {
        id: 1,
        question: 'What has a neck but no head?\n',
        answers: [
            {
                choice: 0,
                value: 'A person'
            },
            {
                choice: 1,
                value: 'A bottle'
            }
        ],
        correctAnswer: 0,
        explanation: 'A bottle = üveg. Az üvegnek is van nyaka, illetve feje.'
    },
    {
        id: 2,
        question: 'What gets wetter as it dries?\n',
        answers: [
            {
                choice: 0,
                value: 'A dress'
            },
            {
                choice: 1,
                value: 'A costume'
            },
            {
                choice: 2,
                value: 'A towel'
            }
        ],
        correctAnswer: 0,
        explanation: 'A towel = törölköző. A törölköző vizes lesz ha megtörölkötünk.'
    },
    {
        id: 3,
        question: 'Which month has 28 days?',
        answers: [
            {
                choice: 0,
                value: 'February'
            },
            {
                choice: 1,
                value: 'All of them'
            }
        ],
        correctAnswer: 1,
        explanation: 'Minden hónapban van legalább 28 nap.'
    },
    {
        id: 4,
        question: 'What is next in this sequence? JFMAMJJASON...',
        answers: [
            {
                choice: 0,
                value: 'A'
            },
            {
                choice: 1,
                value: 'D'
            },
            {
                choice: 2,
                value: 'G'
            }
        ],
        correctAnswer: 1,
        explanation: 'Mivel a sorozat a hónapok kezbdőbetűit tartalmazza, így a helyes válasz a D.'
    }
    ];

const fiftyFifty = () => Math.random() > 0.5;
data.forEach(question => question.answers.sort(() => (fiftyFifty()) ? 1 : -1));
data = data.sort(() => (fiftyFifty()) ? 1 : -1);

const initialState = {
    data: data
};

const reducer = (state = initialState) => state;
const store = createStore(reducer);

const SVGTwitter = () => {
    return(
        <svg id="twitter-icon" xmlns="http://www.w3.org/2000/svg" width="100" height="100" viewBox="0 0 26.458 26.458">
        <path d="M13.23 2.646A10.584 10.584 0 0 0 2.646 13.23 10.584 10.584 0 0 0 13.23 23.812 10.584 10.584 0 0 0 23.81 13.23 10.584 10.584 0 0 0 13.23 2.646zM7.39 7.73c1.085 2.652 5.528 3.396 5.528 3.396 1.082-4.992 4.93-2.228 5.115-1.87.31.423 1.912-.372 1.912-.372.051.584-1.395 1.22-1.395 1.22l1.55.054c.052.317-1.446.742-1.446.742-.104 6.843-5.89 7.704-5.89 7.704-3.049.531-6.097-.848-6.097-.848 2.015.372 4.392-2.122 4.392-2.122-1.67.396-2.902-.692-3.279-1.08a.249.249 0 0 1-.132-.14s.055.06.132.14c.514.256 2.193-.459 2.193-.459-3.255-.424-3.616-2.917-3.616-2.917 1.394 1.38 2.996 1.22 2.996 1.22-2.17.053-1.963-4.668-1.963-4.668z" />
        </svg>
);
};

const Result = styled.div`
  text-align: center;
`;
const Proclamation = styled.h2`
  font-size: 1.2rem;
  margin: 0.8rem 0;
`;
const Score = styled.h1`
  font-weight: 300;
  margin: 1rem 0 2rem;
`;
const Link = styled.a`
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 1.2rem;
  font-family: inherit;
  color: inherit;
  padding: 0.5rem 0;
  transition: all 0.2s ease-out;

  svg {
    width: 42px;
    height: 42px;
    border-radius: 50%;
    margin: 0 0.5rem;
    fill: inherit;
    transition: all 0.2s ease-out;
  }

  &:hover svg {
    background: #333;
    fill: #fff;
  }
`;

const AppResult = (props) => {
    const { correct, total } = props;
    const tweet = `https://twitter.com/intent/tweet?text=Answered%20correctly%20to%20${correct}%20questions%20out%20of%20${total}.%20Your%20turn.`;

    return (
        <Result className="AppResult">
            <Proclamation>You have answered correctly to</Proclamation>
            <Score>{correct} questions out of {total}</Score>

            <Link href={tweet}>
                Ha tetszett oszd meg <SVGTwitter />
            </Link>
        </Result>
    );
};

const Answer = styled.div`
  text-align: center;
  transition: transform 0.2s ease-out;
  transition-delay: 0.05s;

  &.Hidden {
    transform: scale(0);
    height: 0;
    visibility: none;
    opacity: 0;
  }
`;

const Verdict = styled.h2`
  font-size: 1.4rem;
  margin: 0.8rem 0;
`;
const Correction = styled.p`
  margin: 0.8rem 0 1rem;
  font-size: 1.2rem;
`;

const Explanation = styled.p`
  font-size: 1.1rem;
  line-height: 2;
  text-align: initial;
`;

const Button = styled.button`
  margin: 1rem 0;
  background: none;
  border: 1px solid #252525;
  padding: 0.5rem 1rem;
  border-radius: 4px;
  font-size: 1.2rem;
  font-family: inherit;
  color: inherit;
  transition: all 0.2s ease-out;

  &:hover, &:focus {
    background: #252525;
    color: #fff;
  }
  &:active {
    background: #252525;
    color: #fff;
    transform: scale(1.1);
  }
`;

const AppAnswer = (props) => {
    const { isCorrect, isHidden, isLast, nextQuestion, data } = props;
    const { answers, correctAnswer, explanation } = data;
    const className = (isHidden) ? ' AppAnswer Hidden' : 'AppAnswer';

    return (
        <Answer className={ className }>
            {
                isCorrect
                    ?
                    <Verdict>Right Answer!</Verdict>
                    :
                    <React.Fragment>
                        <Verdict>Sorry, wrong answer</Verdict>
                        <Correction>The right answer was: <strong>{ answers.find(answer => answer.choice === correctAnswer).value }</strong></Correction>
                    </React.Fragment>
            }
            <Explanation>{ explanation }</Explanation>
            <Button onClick={ nextQuestion }>{ isLast ? "Continue" : "Check your Score"}</Button>
        </Answer>
    );
};

const Question = styled.h2`
  text-align: center;
  margin: 1rem 0 1.5rem;
  font-weight: 300;
  font-size: 1.4rem;
`;

const Answers = styled.ol`
  font-size: 1.2rem;
  line-height: 4;
  list-style: none;
  counter-reset: special-counter;

  li {
    margin-left: 2rem;
    padding-left: 1.5rem;
    counter-increment: special-counter;
    position: relative;
    cursor: pointer;
    transition: all 0.2s ease-out;

    &:before {
    content: counter(special-counter);
    position: absolute;
    right: 100%;
    top: 50%;
    background: #252a37;
    color: #fff;
    border-radius: 50%;
    width: 2.5rem;
    height: 2.5rem;
    text-align: center;
    line-height: 2.5rem;
    transform: translateY(-50%);
    transition: all 0.2s ease-out;
    }
    &:hover:before {
      background: #252a3799;
    }
    &:hover {
      background: #252a3722;
    }
  }
`;