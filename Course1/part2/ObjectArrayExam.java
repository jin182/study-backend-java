package Course1.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].mtitle="A영화";
        m[0].mmajor="보석";
        m[0].mtime=160;
        m[0].mlevel=15;
        m[0].mday="2023-01-15";

        m[1] = new Movie();
        m[1].mtitle="B영화";
        m[1].mmajor="제갈";
        m[1].mtime=160;
        m[1].mlevel=15;

        m[2] = new Movie();
        m[2].mtitle="B영화";
        m[2].mmajor="김만";
        m[2].mtime=160;
        m[2].mlevel=15;
        m[2].mday="2023-01-15";

        // 반복문
        for(int i=0;i<m.length;i++){
            System.out.println(m[i].mtitle+"\t"+m[i].mmajor+"\t"+m[i].mtime+"\t"+m[i].mlevel+"\t"+m[i].mday);
        }
    }
}
