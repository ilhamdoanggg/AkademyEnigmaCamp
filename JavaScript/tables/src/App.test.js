import React from 'react';
import App from './App';
import {shallow} from "enzyme";

describe('App Component', ()=> {
  describe('Render',  ()=> {
    const appContainer = shallow(<App/>)
    it('should contain one div', ()=> {
      expect(appContainer.find('div')).toHaveLength(3)
    });
    it('should contain one header component as a component', ()=> {
      expect(appContainer.find('div').children('HeaderComponent')).toHaveLength(1)
    });
  });
});

