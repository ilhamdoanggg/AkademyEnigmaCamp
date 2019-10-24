import React from 'react';
import App from './App';
import {shallow} from "enzyme";

describe('App Component', ()=> {
  describe('Render', ()=> {
    const appContainer = shallow(<App/>)
    it('should contain one div',  ()=> {
      expect(appContainer.find('div')).toHaveLength(1);
    });
    it('should contain one header as a child to div', ()=> {
      expect(appContainer.find('div').children('header')).toHaveLength(1)
    });
    it('should contain one img as a child to div', ()=> {
      expect(appContainer.find('div').children('img')).toHaveLength(1)
    });
    it('should contain one input data as a child to div', ()=>{
      expect(appContainer.find('div').children('input')).toHaveLength(1)
    });
    it('should contain one caption label', ()=>{
      expect(appContainer.find('label')).toHaveLength(1)
    });


    describe( 'function', ()=> {
      it('input name should contain string when onChjange perform', ()=> {
        appContainer.find('input').simulate("change", {target:{valeue:"ilham"}})
        expect(appContainer.find("input"))
      });
    });
    describe('', function () {
      it('should ', function () {
        
      });
    });

  });
});
//
// it('renders without crashing', () => {
//   const div = document.createElement('div');
//   ReactDOM.render(<App />, div);
//   ReactDOM.unmountComponentAtNode(div);
// });
// describe('<App />', () => {
//   it('rendder there `.App`', ()=> {
//     const wrapper = render(<App/>);
//     expect(wrapper.find('.App'))
//   });
// });
