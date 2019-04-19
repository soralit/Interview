import { renderer } from "..";
import { chairs, beds, roundTables } from "../src/dataSource";

describe('renderer', () => {
    it('should render chairs', () => {
        expect(renderer(chairs)).toEqual('| Title | Area |\n' +
            '| Chair 1 | 40 |\n' +
            '| Chair 2 | 50 |\n' +
            '| Someone\'s chair | 120 |')
    })
});