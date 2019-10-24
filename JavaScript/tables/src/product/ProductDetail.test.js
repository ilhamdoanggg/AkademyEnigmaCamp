import React from 'react';
import {shallow} from "enzyme";
import ProductDetail from "./ProductDetail";


describe('ProductDetail Component', ()=> {
    describe('Render', ()=> {
        const appContainer = shallow(<ProductDetail/>)
        it('should contain one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should contian one form', ()=> {
            expect(appContainer.find('div').children('form')).toHaveLength(1)
        });
    });
});
