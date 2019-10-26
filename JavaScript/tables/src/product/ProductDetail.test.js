import React from 'react';
import {shallow} from "enzyme";
import ProductDetail from "./ProductDetail";

describe('ProductDetail Component', ()=> {
    describe('Render', ()=> {

        it('should contain one div', ()=> {
            const productDetail = shallow(<ProductDetail/>)
            expect(productDetail.find('div')).toHaveLength(1)
        });
        it('should contian one form', ()=> {
            const productDetail = shallow(<ProductDetail/>)
            expect(productDetail.find('div').children('form')).toHaveLength(1)
        });
    });
});
