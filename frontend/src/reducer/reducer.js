import * as Action from "../action/action";

const initStates = {
    //초기 데이터 셋팅
};

const reducers = (state = initStates, action) => {
    switch (action.type) {
        case "INIT": {
            return initStates;
        }
        default: {
            return state;
        }
    }
};

export default reducers;