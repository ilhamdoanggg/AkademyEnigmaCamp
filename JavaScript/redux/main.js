import {createStore} from "redux";

const increment = {type:'INCREMENT'};
const decrement = {type:'DECREMENT'};
const addElement = {type:'ADD_NEW_ELEMENT'};

function counter(state=[], action) {
    switch (action.type) {
        case 'ADD_NEW_ELEMENT':
            return state.concat([0]);
        case 'INCREMENT':
            return state.map((element, index)=>{
                if (index==action.index){
                    return element+1
                }else {
                    return element
                }
            })
        case 'DECREMENT':
            return state -1;
        default: return state;
    }
}
let store = createStore(counter);
store.subscribe(()=>{console.log(store.getState())})
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch({type:'INCREMENT', index:1});
store.dispatch({type:'INCREMENT', index:2});
store.dispatch({type:'INCREMENT', index:3});
store.dispatch({type:'INCREMENT', index:4});


/*
const increment = {type:'INCREMENT'};
const decrement = {type:'DECREMENT'};

function counter(stats=0, action) {
    switch (action.type) {
        case 'INCREMENT':
            return stats +1;
        case 'DECREMENT':
            return stats -1;
        default: return stats;
    }
}

let store = createStore(counter);
/!*
* stay tune
* *!/
store.subscribe(()=>{console.log(store.getState())})
store.dispatch(increment);
store.dispatch(increment);
store.dispatch(increment);
store.dispatch(increment);
store.dispatch(increment);
store.dispatch(decrement);

//console.log(store.getState())
*/
