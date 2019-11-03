const intialState={
    songs:[]
}
export default function songReducer(state=intialState, action) {
    switch (action.type) {
        case 'SUCCESS_FECTH_DATA_SONG':
            return {...state, songs:action.payload}
        /*ini penting buat mengembalikan nilai default*/
        // case '':
        //     return {}
        default: return {...state}
    }
}
