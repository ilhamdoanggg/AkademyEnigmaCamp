import {createStore} from "redux";

const increment = {type:'INCREMENT'};
const decrement = {type:'DECREMENT'};
const addElement = {type:'ADD_NEW_ELEMENT'};

function counter(state=[{name:"",age:null}], action) {
    switch (action.type) {
        case'ADD_NEW_ELEMENT' :return state.concat([{name:"",age:null}]);
        case'INCREMENT' :return state.map((element,index)=>{
            if (index == action.index){
                return state =  { name: action.name , age:action.age}
            }else {
                return element
            }
        })
        case'DECREMENT' :return state.map((element,index)=>{
            if (index == action.index){
                return element.pop
            }else {
                return element
            }
        })
        default:return state;
    }
}
let store = createStore(counter);
store.subscribe(()=>{console.log(store.getState())})
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch(addElement);
store.dispatch({type:'INCREMENT', index:0, name:"jaka", age:30});
store.dispatch({type:'INCREMENT', index:1, name:"Tony", age:90});
store.dispatch({type:'INCREMENT', index:2, name:"kolek", age:80});


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
