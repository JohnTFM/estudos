import {Boi} from "./Boi.js";

import 'core-js/modules/es.promise.js';
import 'core-js/modules/es.string.includes.js';
import 'core-js/modules/es.object.assign.js';
import 'core-js/modules/es.object.keys.js';
import 'core-js/modules/es.symbol.js';
import 'core-js/modules/es.symbol.async-iterator.js';
import 'regenerator-runtime/runtime.js';


import Exceljs from "exceljs/dist/es5/index.js";
const boi = new Boi({
    peso : 50 + 1,
    idade : 1,
    fase : `Cerca${1}`,
    tipo : 'boioio'
});