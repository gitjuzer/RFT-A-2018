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
    }
    ];