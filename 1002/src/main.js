import { chairs, beds, roundTables } from "./dataSource";
import { view } from './view';

const PI = 3.14;

const renderer = view();

console.log(renderer(chairs));