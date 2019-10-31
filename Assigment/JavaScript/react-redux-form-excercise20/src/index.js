import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import App from './App';
import * as serviceWorker from './serviceWorker';
import {Provider} from "react-redux";
import FormContainer from "./form/FormContainer";
import {createStore} from "redux";
import formCounter from "./reducer/FormReducer";

ReactDOM.render(
    <Provider store={createStore(formCounter)}>
    <FormContainer/>
    </Provider>, document.getElementById('root'));
//ReactDOM.render(<App />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
