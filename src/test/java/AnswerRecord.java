/**
 * 习题答题记录数据结构
 */
public class AnswerRecord {
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
