const intialState = {
    artist: [],
    artistsForm: {
        name: "",
        birdPlace: "",
        debut: "",
        song: []
    }
}

export default function artistReducer(state = intialState, action) {
    switch (action.type) {
        case 'SUCCESS_FECTH_DATA_ARTIST':
            return {...state, artist: action.payload}
        case 'INPUT_NAME':
            return {...state, artistsForm: {...state.artistsForm, name: action.payload}}
        case 'INPUT_BIRD_PLACE':
            return {...state, artistsForm: {...state.artistsForm, birdPlace: action.payload}}
        case 'INPUT_DEBUT':
            return {...state, artistsForm: {...state.artistsForm, debut: action.payload}}
            /*
            * add song array*/
        case 'ADD_SONG_FORM':
            return {
                ...state, artistsForm:
                    {
                        ...state.artistsForm,
                        song: state.artistsForm.song.concat([{songName: '', release: ''}])
                    }
            }
        case 'INPUT_SONG_NAME':
            return {...state, artistsForm: {...state.artistsForm,
                    song: state.artistsForm.song.map((element, index) => {
                        if (index === action.index) {
                            return {...element, songName: action.songName}
                        } else {
                            return element
                        }
                    })
                }
            }
        case 'INPUT_SONG_REALESE':
            return {...state, artistsForm: {...state.artistsForm,
                    song: state.artistsForm.song.map((element, index) => {
                        if (index === action.index) {
                            return {...element, release: action.release}
                        } else {
                            return element
                        }
                    })
                }
            }
        /*ini penting buat mengembalikan nilai default*/
        default:
            return {...state}
    }
}
