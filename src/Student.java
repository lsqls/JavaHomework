public class Student {
    private int score;

    Student(int score){
        this.score=score;
    }

    public int getScore() {
        return score;
    }
    static void isScoreValid(Student student) throws ScoreExceedsMaxValueException {
        int score=student.getScore();
        if(score>100){
            throw new ScoreExceedsMaxValueException(score);
        }
    }
    public static void main(String[] args) {
        Student [] students=new Student[100];
        for(int i=0;i<students.length;i++){
            students[i]=new Student((int)(Math.random()*150+1));
        }
        int normalSum=0,abnormalSum=0,normalCnt=0,abnormalCnt=0;
        for(Student student:students){
            try {
                isScoreValid(student);
                normalSum+=student.getScore();
                normalCnt++;

            }
            catch (ScoreExceedsMaxValueException scoreExceedsMaxValueException){
                scoreExceedsMaxValueException.printStackTrace();
                abnormalSum+=student.getScore();
                abnormalCnt++;
            }

        }
        System.out.println("正常分数人数："+normalCnt+"，平均分："+(double)normalSum/(double)normalCnt);
        System.out.println("异常分数人数："+abnormalCnt+"，平均分："+(double)abnormalSum/(double)abnormalCnt);

        
    }
}


class ScoreExceedsMaxValueException extends RuntimeException {
    int score;
    ScoreExceedsMaxValueException(int score){
        super(score+" exceeds max value");
        this.score=score;
    }
    


    
    
}