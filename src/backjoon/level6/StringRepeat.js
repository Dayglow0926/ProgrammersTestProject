/*
문제 링크
https://www.acmicpc.net/problem/2675
* */
//const input = require('../../helper/inputHelper');

/*
acc ?
initialValue(Optional)
최초 callback함수 실행 시 accumulator 인수에 제공되는 값,
초기값을 제공하지 않을경우 배열의 첫 번째 요소를 사용하고,
빈 배열에서 초기값이 없을 경우 에러가 발생합니다.

currentValue - 배열의 현재 요소
index - 배열의 현재 요소 인덱스
array - 호출한 배열
*/
const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : __dirname + '/input.txt';
let input = fs.readFileSync(filePath).toString().trim().split('\n');

input.shift();

input.map((acc) => {
    const word = acc.split(" ");
    var alphabet = word[1].split("");
    var result = "";

    alphabet.map((str) => {
        result += str.repeat(word[0]);
    })

    console.log(result);
})
