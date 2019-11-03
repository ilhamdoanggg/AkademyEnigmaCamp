const intialState={
    artist:[]
}
export default function artistReducer(state=intialState, action) {
    switch (action.type) {
        case 'SUCCESS_FECTH_DATA_ARTIST':
            return {...state, artist:action.payload}
            /*ini penting buat mengembalikan nilai default*/
        // case '':
        //     return {}
        default: return {...state}
    }
}
