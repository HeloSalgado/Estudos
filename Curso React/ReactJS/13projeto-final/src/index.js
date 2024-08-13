import React from 'react';
import {createRoot} from 'react-dom/client';
import Principal from './Principal';

import './style.css';

let container = document.getElementById('root');
let root = createRoot(container);
root.render(<Principal />);  