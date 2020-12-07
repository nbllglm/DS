import java.util.*;


/**
 * 现有这么一个使用场景，用户做完一个课程的习题后有一个习题情况记录列表，本地已有用户该课程所有层级结构状态记录，
 * 请完成代码更新本地用户该课程层级结构每个节点的完成习题数、正确习题数及掌握知识点数。
 *
 * <p>
 * 该课程结构是一个树状结构，知识点为此树状结构的叶子节点，(为方便理解以下称为树状结构)
 * 同一个知识点可以同时在不同的非叶子节点下，知识点关联了习题，
 * 并且一个习题可能关联多个知识点，一个知识点也可以关联多个习题，即多对多关系。
 * 习题答题记录数据结构中的parents是这个习题关联的所有知识点的父id集合的去重集合。
 * </p>
 * <pre>
 * 例子:
 * 政治(id=1)
 *   ├── 马原理(id=2)
 *   │&nbsp;&nbsp; ├── 知识点1(id=4)
 *   │&nbsp;&nbsp; └── 知识点2(id=5)
 *   └── 毛中特(id=3)
 *       ├── 毛特(id=6)
 *       │&nbsp;&nbsp; ├── 知识点1(id=4)
 *       │&nbsp;&nbsp; ├── 知识点3(id=7)
 *       │&nbsp;&nbsp; └── 知识点4(id=8)
 *       └── 中特(id=9)
 *           ├── 知识点1(id=4)
 *           └── 知识点5(id=10)
 *
 * 如有习题1关联知识点1和知识点5, 其parents="4,2,1,6,3,10,9";
 * 如有习题2关联知识点2和知识点3, 其parents="5,2,1,7,6,3";
 *
 * </pre>
 * <p>
 * 完成习题数: 树状课程结构节点完成的习题个数。</br>
 * 正确习题数: 树状课程结构节点正确的习题个数。</br>
 * 掌握知识点数: 树状课程结构节点掌握的知识点个数(知识点正确习题数大于所有习题数的60%即为掌握)。</br>
 *
 * <p>已有两个方法获取树状结构id是否是知识点、树状结构节点关联的总题数和本地已有保存的用户树状结构记录</p>
 *
 * @see #getCourseNodes(long[] ids) 获取树状结构id是否是知识点、树状结构节点关联的总题数
 * @see #getLocalUserCourseRecords(long[] ids) 返回本地已有保存的用户树状结构记录
 * @see CourseNode 树状课程结构节点数据结构
 * @see AnswerRecord 习题答题记录数据结构
 * @see UserCourseRecord 需要更新的树状结构的数据结构
 * getUserCourseRecords(List<AnswerRecord> records) 面试者需要完成的方法
 */
public class UserExerciseRecord {
    public static void main(String[] args) {
//        String asd = "1,2,4,5,1,2,4,2,5,5,2";
//        System.out.println(Arrays.toString(parseLongArray(asd)));
//        LinkedList<Long> longs = new LinkedList<>();
//        longs.add(Long.valueOf(3));
//        longs.add(Long.valueOf(5));
//        longs.add(Long.valueOf(7));
//        longs.add(Long.valueOf(10));
//        System.out.println(longs);
//        longs.addFirst(Long.valueOf(1));
//        longs.addLast(Long.valueOf(13));
//        System.out.println(longs);
//        System.out.println(longs.peekFirst());
//        System.out.println(longs.peekLast());

    }

    static long[] parseLongArray(String parents) throws NumberFormatException {
        String[] strings = parents.split(",");
        long[] longs = new long[strings.length];
        for (int i = 0; i < strings.length; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }
        return longs;
    }

    static long[] parseLongArray(List<CourseNode> list) throws NumberFormatException {
        long[] longs = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            longs[i] = list.get(i).id;
        }
        return longs;
    }

    UserCourseRecord findUserCourseRecord(List<UserCourseRecord> list, long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                return list.get(i);
            }
        }
        return null;
    }

    /**
     * 请完成以下方法，实现以上功能
     *
     * @param records 答题记录集合
     * @return
     */
    public List<UserCourseRecord> getUserCourseRecords(List<AnswerRecord> records) {
        //TODO 需要编写的逻辑
        HashMap<Long, Integer> examinationCountMap = new HashMap<>();
        for (int i = 0; i < records.size(); i++) {
            AnswerRecord answerRecord = records.get(i);

            long[] parents = parseLongArray(answerRecord.parents);
            //parents中对应的所有节点
            List<CourseNode> allNodeList = getCourseNodes(parents);
            List<CourseNode> knowledgeNodeList = new ArrayList<>();
            List<CourseNode> coursesNodeList = new ArrayList<>();
            for (int j = 0; j < allNodeList.size(); j++) {
                if (allNodeList.get(i).knowledge) {
                    knowledgeNodeList.add(allNodeList.get(i));
                } else {
                    coursesNodeList.add(allNodeList.get(i));
                }
            }
            //parents中对应的所有课程(非知识点)节点
            long[] courses = parseLongArray(coursesNodeList);
            //parents中对应的所有课程(非知识点)的做题记录
            List<UserCourseRecord> userCourseRecords = getLocalUserCourseRecords(courses);

        }

        return null;
    }


    /**
     * 树状结构(parents的中某个id)课程节点是否知识点及总题数 (无需编写这是已有方法)
     *
     * @param ids 树状结构id
     * @return
     */
    private List<CourseNode> getCourseNodes(long[] ids) {
        // 无需编写这是已有方法
        return new ArrayList<CourseNode>();
    }

    /**
     * 本地已有保存的用户树状结构记录 (无需编写这是已有方法)
     *
     * @param ids 树状结构id
     * @return
     */
    private List<UserCourseRecord> getLocalUserCourseRecords(long[] ids) {
        // 无需编写这是已有方法
        return new ArrayList<UserCourseRecord>();
    }

    /**
     * 习题答题记录数据结构
     */
    static class AnswerRecord {

        /**
         * 习题id
         */
        long id;
        /**
         * 这次答题是否正确
         */
        boolean correct;
        /**
         * 习题相关知识点及课程结构列表以逗号(,)分隔
         * parents字段是一个树状课程结构的id, 并且叶子定义为知识点, 习题可能关联多个知识点，parents是习题所有相关知识点id及其相关父节点id的去重集合
         */
        String parents;
        /**
         * 上次答题情况，-1从未做过，0上次做错，1上次正确
         */
        int last;
    }

    /**
     * 树状课程结构节点数据结构
     */

    static class CourseNode {

        /**
         * 节点id
         */
        long id;
        /**
         * 是否是知识点
         */
        boolean knowledge;
        /**
         * 节点拥有习题数
         */
        int exercisesCount;
    }

    /**
     * 需要更新课程结构的数据结构
     */

    static class UserCourseRecord {
        /**
         * 课程结构id
         */
        long id;
        /**
         * 完成习题数
         */
        int completed = 0;
        /**
         * 正确习题数
         */
        int correct = 0;
        /**
         * 掌握知识点数
         */
        int master = 0;
    }
}

