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