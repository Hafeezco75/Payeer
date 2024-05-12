
const {getYears from 'datefunction'

test("get the birthdate and returns age",  () => {

let fewdays = "December 11, 2022 23:15:20"

let today = new Date()

let result = getYears("December 11, 2022 23:15:20", new Date());

expect(result).toBe(1.41644);

}});
