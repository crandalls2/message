package edu.nku.csc440.message;

/**
 *
 * @author Shane Crandall
 * @version 0
 */
class TextImage extends Media {

    TextImage(double end, String src, Region region) {
        setEnd(end);
        setSrc(src);
        setRegion(region);
    }

    TextImage(double begin, double end, String src, Region region) {
        this(end, src, region);
        setBegin(begin);
    }
}
