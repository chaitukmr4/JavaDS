//import java.util.*;
//import java.math.BigDecimal;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.LinkedList;
//import java.util.List;
//
//import static java.math.BigDecimal.ZERO;
//import static java.util.stream.Collectors.averagingDouble;
//import static java.util.stream.Collectors.groupingBy;
//
//class SamplePreprocessor {
//
//    private final SampleNormalizer normalizer;
//
//    SamplePreprocessor(SampleNormalizer normalizer) {
//        this.normalizer = normalizer;
//    }
//
//    Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
//
//        List<BigDecimal> samplesWithOutNoises = new LinkedList<>();
//        for (BigDecimal sample : input.collect(Collectors.toList())) {
//            if(sample != null && sample.compareTo(BigDecimal.ZERO)>=0){
//                samplesWithOutNoises.add(sample);
//            }
//        }
//        Integer size = samplesWithOutNoises.size();
//        size /= 3;
//        size *= 3;
//        List<List<BigDecimal>> triples = new LinkedList<>();
//        List<BigDecimal> current = new LinkedList<>();
//        for(Integer i=0;i<size;i++){
//
//            current.add(samplesWithOutNoises.get(i));
//
//            if(current.size() == 3){
//                triples.add(new LinkedList<>(current));
//                current.clear();
//            }
//
//        }
//
//        List<BigDecimal> processedSamples = new LinkedList<>();
//        for(List<BigDecimal> triple : triples){
//            if(averageCheck(triple)){
//                processedSamples.add(triple.get(0));
//                processedSamples.add(triple.get(1));
//                processedSamples.add(triple.get(2));
//            }
//        }
//        return processedSamples.stream();
//    }
//
//
//    public static boolean averageCheck(List<BigDecimal> triple){
//        BigDecimal sum = BigDecimal.ZERO;
//        sum = sum.add(triple.get(0));
//        sum = sum.add(triple.get(1));
//        sum = sum.add(triple.get(2));
//        if(sum.divide(new BigDecimal(3),RoundingMode.CEILING).compareTo(BigDecimal.valueOf(30.0)) > 0){
//            return true;
//        }
//        return false;
//    }
//}
//
//
//
//
//public class Main
//{
//    public static boolean averageCheck(List<BigDecimal> triple){
//        BigDecimal sum = BigDecimal.ZERO;
//        sum = sum.add(triple.get(0));
//        sum = sum.add(triple.get(1));
//        sum = sum.add(triple.get(2));
//        if(sum.divide(new BigDecimal(3),RoundingMode.CEILING).compareTo(BigDecimal.valueOf(30.0)) > 0){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        List<BigDecimal> labSamples = new LinkedList<>();
//        labSamples.add(BigDecimal.valueOf(29.9));
//        labSamples.add(BigDecimal.valueOf(40.0));
//        labSamples.add(BigDecimal.valueOf(29.99));
//        labSamples.add(BigDecimal.valueOf(-17.99));
//        labSamples.add(BigDecimal.valueOf(25.0));
//        labSamples.add(BigDecimal.valueOf(48.99));
//        labSamples.add(BigDecimal.valueOf(14.99));
//        labSamples.add(null);
//        labSamples.add(BigDecimal.valueOf(-5.5));
//
//        List<BigDecimal> samplesWithOutNoises = new LinkedList<>();
//        for (BigDecimal sample : labSamples) {
//            if(sample != null && sample.compareTo(BigDecimal.ZERO)>=0){
//                samplesWithOutNoises.add(sample);
//            }
//        }
//        Integer size = samplesWithOutNoises.size();
//        size /= 3;
//        size *= 3;
//        List<List<BigDecimal>> triples = new LinkedList<>();
//        List<BigDecimal> current = new LinkedList<>();
//        for(Integer i=0;i<size;i++){
//
//            current.add(samplesWithOutNoises.get(i));
//
//            if(current.size() == 3){
//                triples.add(new LinkedList<>(current));
//                current.clear();
//            }
//
//        }
//
//        List<BigDecimal> processedSamples = new LinkedList<>();
//        for(List<BigDecimal> triple : triples){
//            if(averageCheck(triple)){
//                processedSamples.add(triple.get(0));
//                processedSamples.add(triple.get(1));
//                processedSamples.add(triple.get(2));
//            }
//        }
//
//        System.out.println(processedSamples);
//    }
//}
