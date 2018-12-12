var _createClass = function () {function defineProperties(target, props) {for (var i = 0; i < props.length; i++) {var descriptor = props[i];descriptor.enumerable = descriptor.enumerable || false;descriptor.configurable = true;if ("value" in descriptor) descriptor.writable = true;Object.defineProperty(target, descriptor.key, descriptor);}}return function (Constructor, protoProps, staticProps) {if (protoProps) defineProperties(Constructor.prototype, protoProps);if (staticProps) defineProperties(Constructor, staticProps);return Constructor;};}();var _templateObject = _taggedTemplateLiteral(['\n  text-align: center;\n'], ['\n  text-align: center;\n']),_templateObject2 = _taggedTemplateLiteral(['\n  font-size: 1.2rem;\n  margin: 0.8rem 0;\n'], ['\n  font-size: 1.2rem;\n  margin: 0.8rem 0;\n']),_templateObject3 = _taggedTemplateLiteral(['\n  font-weight: 300;\n  margin: 1rem 0 2rem;\n'], ['\n  font-weight: 300;\n  margin: 1rem 0 2rem;\n']),_templateObject4 = _taggedTemplateLiteral(['\n  display: flex;\n  justify-content: center;\n  align-items: center;\n  font-size: 1.2rem;\n  font-family: inherit;\n  color: inherit;\n  padding: 0.5rem 0;\n  transition: all 0.2s ease-out;\n\n  svg {\n    width: 42px;\n    height: 42px;\n    border-radius: 50%;\n    margin: 0 0.5rem;\n    fill: inherit;\n    transition: all 0.2s ease-out;\n  }\n\n  &:hover svg {\n    background: #333;\n    fill: #fff;\n  }\n'], ['\n  display: flex;\n  justify-content: center;\n  align-items: center;\n  font-size: 1.2rem;\n  font-family: inherit;\n  color: inherit;\n  padding: 0.5rem 0;\n  transition: all 0.2s ease-out;\n\n  svg {\n    width: 42px;\n    height: 42px;\n    border-radius: 50%;\n    margin: 0 0.5rem;\n    fill: inherit;\n    transition: all 0.2s ease-out;\n  }\n\n  &:hover svg {\n    background: #333;\n    fill: #fff;\n  }\n']),_templateObject5 = _taggedTemplateLiteral(['\n  text-align: center;\n  transition: transform 0.2s ease-out;\n  transition-delay: 0.05s;\n\n  &.Hidden {\n    transform: scale(0);\n    height: 0;\n    visibility: none;\n    opacity: 0;\n  }\n'], ['\n  text-align: center;\n  transition: transform 0.2s ease-out;\n  transition-delay: 0.05s;\n\n  &.Hidden {\n    transform: scale(0);\n    height: 0;\n    visibility: none;\n    opacity: 0;\n  }\n']),_templateObject6 = _taggedTemplateLiteral(['\n  font-size: 1.4rem;\n  margin: 0.8rem 0;\n'], ['\n  font-size: 1.4rem;\n  margin: 0.8rem 0;\n']),_templateObject7 = _taggedTemplateLiteral(['\n  margin: 0.8rem 0 1rem;\n  font-size: 1.2rem;\n'], ['\n  margin: 0.8rem 0 1rem;\n  font-size: 1.2rem;\n']),_templateObject8 = _taggedTemplateLiteral(['\n  font-size: 1.1rem;\n  line-height: 2;\n  text-align: initial;\n'], ['\n  font-size: 1.1rem;\n  line-height: 2;\n  text-align: initial;\n']),_templateObject9 = _taggedTemplateLiteral(['\n  margin: 1rem 0;\n  background: none;\n  border: 1px solid #252525;\n  padding: 0.5rem 1rem;\n  border-radius: 4px;\n  font-size: 1.2rem;\n  font-family: inherit;\n  color: inherit;\n  transition: all 0.2s ease-out;\n\n  &:hover, &:focus {\n    background: #252525;\n    color: #fff;\n  }\n  &:active {\n    background: #252525;\n    color: #fff;\n    transform: scale(1.1);\n  }\n'], ['\n  margin: 1rem 0;\n  background: none;\n  border: 1px solid #252525;\n  padding: 0.5rem 1rem;\n  border-radius: 4px;\n  font-size: 1.2rem;\n  font-family: inherit;\n  color: inherit;\n  transition: all 0.2s ease-out;\n\n  &:hover, &:focus {\n    background: #252525;\n    color: #fff;\n  }\n  &:active {\n    background: #252525;\n    color: #fff;\n    transform: scale(1.1);\n  }\n']),_templateObject10 = _taggedTemplateLiteral(['\n  text-align: center;\n  margin: 1rem 0 1.5rem;\n  font-weight: 300;\n  font-size: 1.4rem;\n'], ['\n  text-align: center;\n  margin: 1rem 0 1.5rem;\n  font-weight: 300;\n  font-size: 1.4rem;\n']),_templateObject11 = _taggedTemplateLiteral(['\n  font-size: 1.2rem;\n  line-height: 4;\n  list-style: none;\n  counter-reset: special-counter;\n\n  li {\n    margin-left: 2rem;\n    padding-left: 1.5rem;\n    counter-increment: special-counter;\n    position: relative;\n    cursor: pointer;\n    transition: all 0.2s ease-out;\n\n    &:before {\n    content: counter(special-counter);\n    position: absolute;\n    right: 100%;\n    top: 50%;\n    background: #252a37;\n    color: #fff;\n    border-radius: 50%;\n    width: 2.5rem;\n    height: 2.5rem;\n    text-align: center;\n    line-height: 2.5rem;\n    transform: translateY(-50%);\n    transition: all 0.2s ease-out;\n    }\n    &:hover:before {\n      background: #252a3799;\n    }\n    &:hover {\n      background: #252a3722;\n    }\n  }\n'], ['\n  font-size: 1.2rem;\n  line-height: 4;\n  list-style: none;\n  counter-reset: special-counter;\n\n  li {\n    margin-left: 2rem;\n    padding-left: 1.5rem;\n    counter-increment: special-counter;\n    position: relative;\n    cursor: pointer;\n    transition: all 0.2s ease-out;\n\n    &:before {\n    content: counter(special-counter);\n    position: absolute;\n    right: 100%;\n    top: 50%;\n    background: #252a37;\n    color: #fff;\n    border-radius: 50%;\n    width: 2.5rem;\n    height: 2.5rem;\n    text-align: center;\n    line-height: 2.5rem;\n    transform: translateY(-50%);\n    transition: all 0.2s ease-out;\n    }\n    &:hover:before {\n      background: #252a3799;\n    }\n    &:hover {\n      background: #252a3722;\n    }\n  }\n']),_templateObject12 = _taggedTemplateLiteral(['\n  text-align: center;\n  display: inline-block;\n  font-family: "Lato", sans-serif;\n  padding: 0.5rem 0;\n  border-top: 0.2rem solid #252a37;\n  border-bottom: 0.2rem solid #252a37;\n  background: #fff;\n'], ['\n  text-align: center;\n  display: inline-block;\n  font-family: "Lato", sans-serif;\n  padding: 0.5rem 0;\n  border-top: 0.2rem solid #252a37;\n  border-bottom: 0.2rem solid #252a37;\n  background: #fff;\n']);function _classCallCheck(instance, Constructor) {if (!(instance instanceof Constructor)) {throw new TypeError("Cannot call a class as a function");}}function _possibleConstructorReturn(self, call) {if (!self) {throw new ReferenceError("this hasn't been initialised - super() hasn't been called");}return call && (typeof call === "object" || typeof call === "function") ? call : self;}function _inherits(subClass, superClass) {if (typeof superClass !== "function" && superClass !== null) {throw new TypeError("Super expression must either be null or a function, not " + typeof superClass);}subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } });if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass;}function _taggedTemplateLiteral(strings, raw) {return Object.freeze(Object.defineProperties(strings, { raw: { value: Object.freeze(raw) } }));}var _Redux = Redux,createStore = _Redux.createStore;var _ReactRedux =
    ReactRedux,Provider = _ReactRedux.Provider,connect = _ReactRedux.connect;
var Component = React.Component;var
    styled = styled.default;var _ReactDOM =
    ReactDOM,render = _ReactDOM.render;

var data = [
    {
        id: 0,
        question: 'What has a face and two hands but no arms or legs?',
        answers: [
            {
                choice: 0,
                value: 'A man' },

            {
                choice: 1,
                value: 'A clock' }],


        correctAnswer: 1,
        explanation: 'A "hands" jelentése nem csak kéz, hanem mutató is.' },

    {
        id: 1,
        question: 'What has a neck but no head?',
        answers: [
            {
                choice: 0,
                value: 'A bottle' },

            {
                choice: 1,
                value: 'A lamp' }],


        correctAnswer: 0,
        explanation: 'A lámpának nincsen nyaka, de az italos üvegnek van.' },

    {
        id: 2,
        question: 'What is next in this sequence? JFMAMJJASON...',
        answers: [
            {
                choice: 0,
                value: 'A' },

            {
                choice: 1,
                value: 'Z' },

            {
                choice: 2,
                value: 'D' }],


        correctAnswer: 2,
        explanation: 'A betűk a hónapok nevének kezdőbetűi angolul. Így a következő a "D".' },

    {
        id: 3,
        question: 'Which month has 28 days?',
        answers: [
            {
                choice: 0,
                value: 'February' },

            {
                choice: 1,
                value: 'All of them' }],


        correctAnswer: 1,
        explanation: 'Minden hónapban van legalább 28 nap.' },

    {
        id: 4,
        question: 'What gets wetter as it dries?',
        answers: [
            {
                choice: 0,
                value: 'A dress' },

            {
                choice: 1,
                value: 'A towel' },

            {
                choice: 2,
                value: 'A costume' }],


        correctAnswer: 1,
        explanation: 'Mivel a törölközőt használjuk bevizesedik, ahogy száradna újra vizes lesz.' }

    ];



var fiftyFifty = function fiftyFifty() {return Math.random() > 0.5;};
data.forEach(function (question) {return question.answers.sort(function () {return fiftyFifty() ? 1 : -1;});});
data = data.sort(function () {return fiftyFifty() ? 1 : -1;});


var initialState = {
    data: data
};
var reducer = function reducer() {var state = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : initialState;return state;};
var store = createStore(reducer);

var SVGTwitter = function SVGTwitter() {
    return (
        React.createElement('svg', { id: 'twitter-icon', xmlns: 'http://www.w3.org/2000/svg', width: '100', height: '100', viewBox: '0 0 26.458 26.458' },
            React.createElement('path', { d: 'M13.23 2.646A10.584 10.584 0 0 0 2.646 13.23 10.584 10.584 0 0 0 13.23 23.812 10.584 10.584 0 0 0 23.81 13.23 10.584 10.584 0 0 0 13.23 2.646zM7.39 7.73c1.085 2.652 5.528 3.396 5.528 3.396 1.082-4.992 4.93-2.228 5.115-1.87.31.423 1.912-.372 1.912-.372.051.584-1.395 1.22-1.395 1.22l1.55.054c.052.317-1.446.742-1.446.742-.104 6.843-5.89 7.704-5.89 7.704-3.049.531-6.097-.848-6.097-.848 2.015.372 4.392-2.122 4.392-2.122-1.67.396-2.902-.692-3.279-1.08a.249.249 0 0 1-.132-.14s.055.06.132.14c.514.256 2.193-.459 2.193-.459-3.255-.424-3.616-2.917-3.616-2.917 1.394 1.38 2.996 1.22 2.996 1.22-2.17.053-1.963-4.668-1.963-4.668z' })));


};



var Result = styled.div(_templateObject);


var Proclamation = styled.h2(_templateObject2);



var Score = styled.h1(_templateObject3);



var Link = styled.a(_templateObject4);

var AppResult = function AppResult(props) {
    var
        correct = props.correct,total = props.total;

    var tweet = 'https://twitter.com/intent/tweet?text=Answered%20correctly%20to%20' + correct + '%20questions%20out%20of%20' + total + '.%20Your%20turn.';

    return (
        React.createElement(Result, { className: 'AppResult' },
            React.createElement(Proclamation, null, 'You have answered correctly to'),
            React.createElement(Score, null, correct, ' questions out of ', total),

            React.createElement(Link, { href: tweet }, 'Ha tetszett a játék, oszd meg az eredményed!',
                React.createElement(SVGTwitter, null))));
};

var Answer = styled.div(_templateObject5);

var Verdict = styled.h2(_templateObject6);

var Correction = styled.p(_templateObject7);

var Explanation = styled.p(_templateObject8);

var Button = styled.button(_templateObject9);

var AppAnswer = function AppAnswer(props) {
    var
        isCorrect = props.isCorrect,isHidden = props.isHidden,isLast = props.isLast,nextQuestion = props.nextQuestion,data = props.data;var
        answers = data.answers,correctAnswer = data.correctAnswer,explanation = data.explanation;

    var className = isHidden ? ' AppAnswer Hidden' : 'AppAnswer';


    return (
        React.createElement(Answer, { className: className },

            isCorrect ?

                React.createElement(Verdict, null, 'Right Answer!') :

                React.createElement(React.Fragment, null,
                    React.createElement(Verdict, null, 'Sorry, wrong answer'),
                    React.createElement(Correction, null, 'The right answer was: ', React.createElement('strong', null, answers.find(function (answer) {return answer.choice === correctAnswer;}).value))),


            React.createElement(Explanation, null, explanation),
            React.createElement(Button, { onClick: nextQuestion }, isLast ? "Continue" : "Check your Score")));


};


var Question = styled.h2(_templateObject10);

var Answers = styled.ol(_templateObject11);


var AppQuestion = function AppQuestion(props) {
var _props$data =
        props.data,question = _props$data.question,answers = _props$data.answers;var
        showAnswer = props.showAnswer;

    var choices = answers.map(function (answer) {return (
        React.createElement('li', {
                key: answer.answer,
                choice: answer.choice,
                onClick: showAnswer },
            answer.value));});
    return (
        React.createElement('div', { className: 'AppQuestion' },
            React.createElement(Question, null, question),
            React.createElement(Answers, null,
                choices)));
};

var Counter = styled.h3(_templateObject12);

var Index = function (_Component) {_inherits(App, _Component);
    function App(props) {_classCallCheck(this, App);
    var _this = _possibleConstructorReturn(this, (App.__proto__ || Object.getPrototypeOf(App)).call(this, props));
        _this.state = {
            counter: 0,
            correct: 0,
            isHidden: true,
            isCorrect: false,
            isFinished: false

        };_this.showAnswer = _this.showAnswer.bind(_this);
        _this.nextQuestion = _this.nextQuestion.bind(_this);return _this;
    }_createClass(App, [{ key: 'showAnswer', value: function showAnswer(

            e) {
            var target = e.target;
            var answer = parseInt(target.getAttribute('choice'));
            var correctanswer = this.props.data[this.state.counter].correctAnswer;
            var isCorrect = answer === correctanswer;
            var correct = isCorrect ? this.state.correct + 1 : this.state.correct;

            this.setState({
                correct: correct,
                isCorrect: isCorrect,
                isHidden: false });

        } }, { key: 'nextQuestion', value: function nextQuestion()

        {
            var counter = this.state.counter;
            var length = this.props.data.length;
            if (counter === length - 1) {
                this.setState({
                    isFinished: true });

            }

            else {
                this.setState({
                    counter: this.state.counter + 1,
                    isHidden: true });

            }
        }
        }, { key: 'render', value: function render()

        {
            return (
                React.createElement('div', { className: 'Index' },

                    !this.state.isFinished ?

                        React.createElement(React.Fragment, null,
                            React.createElement(Counter, null, this.state.counter + 1, '/', this.props.data.length),
                            React.createElement(AppQuestion, { showAnswer: this.showAnswer, data: this.props.data[this.state.counter] }),
                            React.createElement(AppAnswer, { isHidden: this.state.isHidden, isLast: this.state.counter !== this.props.data.length - 1, isCorrect: this.state.isCorrect, nextQuestion: this.nextQuestion, data: this.props.data[this.state.counter] })) :


                        React.createElement(AppResult, { correct: this.state.correct, total: this.props.data.length })));



        } }]);return App;}(Component);


var mapStateToProps = function mapStateToProps(state) {return {
    data: state.data };};

Index = connect(mapStateToProps)(Index);

ReactDOM.render(
    React.createElement(Provider, { store: store },
        React.createElement(Index, null)),
    document.getElementById('root'));