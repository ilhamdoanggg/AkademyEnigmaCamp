
const initialState={
    artist:[]
}

export default function formCounter(state=initialState, action) {
    switch (action.type) {
        case 'ADD_FORM_ELEMENT':
            return {...state, artist:state.artist.concat([{name:"", age:""}])}
        case 'INCREMENT_NAME':

            return {...state, artist:state.artist.map((element, index)=>{
                if (index===action.index){
                    return {...element, name:action.name}
                }
                    return element
                })}
        case 'INCREMENT_AGE':
            return {...state, artist:state.artist.map((element, index)=>{
                    if (index===action.index){
                        return {...element, age:action.age}
                    }
                    return element
                })}
        default:return state;
    }
}
        // case 'REMOVE_FORM_ELEMENT':
        //     return {...state, artist:state.artist.splice([0])}
        // case 'INCREMENT':
        //     return {...state, artist:state.artist.map((element, index)=>
        //         index===action.index?element+1:element)}
        // case 'DECREMENT':
        //     return {...state, artist:state.artist.map((element, index)=>
        //             index===action.index?element-1:element)}


