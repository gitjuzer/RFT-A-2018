const { createStore } = Redux;
const { Provider, connect } = ReactRedux;
const Component = React.Component;
const { default : styled } = styled;
const { render } = ReactDOM;

let data = [
    {
        id: 0,
        question: 'What has branches and leaves but has no bark?',
        answers: [
            {
                choice: 0,
                value: 'A library'
            },
            {
                choice: 1,
                value: 'A tree'
            }
        ],
        correctAnswer: 0,
        explanation: 'Just think about it. The library made from wood.'
    }
    ];