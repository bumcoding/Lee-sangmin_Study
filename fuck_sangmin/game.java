public class game {
    public static void main(String[] args) {
        // 1부터 99까지 반복
        for (int i = 1; i < 100; i++) {
            int temp = i;  // 임시 변수에 i 값을 저장합니다.
            int count = 0; // 박수 치는 횟수를 저장하는 변수를 초기화합니다.

            // temp 값이 0이 될 때까지 반복합니다.
            while (temp > 0) {
                int digit = temp % 10;  // 맨 끝 자리 숫자를 추출합니다.
                
                // 만약 맨 끝 자리 숫자가 3, 6, 9 중 하나라면 count 값을 증가시킵니다.
                if (digit == 3 || digit == 6 || digit == 9) {
                    count++;
                }
                
                temp /= 10;  // 맨 끝 자리 숫자를 제거합니다.
            }
            
            // 만약 count 값이 0보다 크다면 박수를 치도록 메시지를 출력합니다.
            if (count > 0) {
                // 박수를 쳐야하는 횟수에 따라 출력 메시지를 조절합니다.
                String claps = "박수 ";
                for (int j = 0; j < count; j++) {
                    claps += "짝";
                }
                System.out.println(i + " / " + claps);
            }
        }
    }
}
