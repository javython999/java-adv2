package annotation.basic;

@AnnoMeta
public class MetaData {

    //@AnnoMeta
    public String id;

    @AnnoMeta
    public void call() {}

    public static void main(String[] args) throws NoSuchMethodException {
        Class<MetaData> metaDataClass = MetaData.class;
        AnnoMeta annotation = metaDataClass.getAnnotation(AnnoMeta.class);
        System.out.println("typeAnno = " + annotation);

        AnnoMeta methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("methodAnno = " + methodAnno);
    }
}
