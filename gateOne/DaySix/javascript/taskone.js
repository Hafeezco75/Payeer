function getYears(fewdays, today)  {
    let Oldday = new Date("December 11, 2022 23:15:20");

    let Today = new Date();
    let todays = Today.getTime();
    let fewday = Oldday.getTime();
    let year = 1000 * 60 * 60 * 24 * 365;
    let years = (todays - fewday) / year;
    return years;

}
 
let result = getYears("December 11, 2022 23:15:20", new Date());

console.log(result);