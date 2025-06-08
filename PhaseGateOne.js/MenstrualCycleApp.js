
let lastPeriodStr = "2023-07-23"; 
let cycleLength = 28;            
let periodLength = 6;             
let lastPeriod = new Date(lastPeriodStr);


let nextPeriod = new Date(lastPeriod);
nextPeriod.setDate(lastPeriod.getDate() + cycleLength);

let ovulationDay = new Date(nextPeriod);
ovulationDay.setDate(nextPeriod.getDate() - 14);


let fertileStart = new Date(ovulationDay);
fertileStart.setDate(ovulationDay.getDate() - 5);

let fertileEnd = new Date(ovulationDay);
fertileEnd.setDate(ovulationDay.getDate() + 1);


let safeStart1 = new Date(lastPeriod);
safeStart1.setDate(lastPeriod.getDate() + periodLength);

let safeEnd1 = new Date(fertileStart);
safeEnd1.setDate(fertileStart.getDate() - 1);


let safeStart2 = new Date(fertileEnd);
safeStart2.setDate(fertileEnd.getDate() + 1);

let safeEnd2 = new Date(nextPeriod);
safeEnd2.setDate(nextPeriod.getDate() - 1);


console.log("---- Menstrual Cycle Details ----");
console.log("Next period starts:", nextPeriod.toDateString());
console.log("Ovulation Day:", ovulationDay.toDateString());
console.log("Fertile Window:", fertileStart.toDateString(), "to", fertileEnd.toDateString());
console.log("Safe Periods:");
console.log("- Before Ovulation:", safeStart1.toDateString(), "to", safeEnd1.toDateString());
console.log("- After Ovulation:", safeStart2.toDateString(), "to", safeEnd2.toDateString());
