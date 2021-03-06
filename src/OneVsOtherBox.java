import java.util.ArrayList;
import java.util.List;
/**
 * @author Ubaby The MIT License (MIT) Copyright (c)
 * 
 *         <2016><Gintaras Koncevicius>
 * 
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 * 
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 * 
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 */
public class OneVsOtherBox {
    private String oneLabel = "unknown";
    private String otherLabel = "unknown";
    private List<VectorBox> one = new ArrayList<VectorBox>();
    private List<VectorBox> other = new ArrayList<VectorBox>();
    private List<VectorBox> closestOne = new ArrayList<VectorBox>();
    private List<VectorBox> closestOther = new ArrayList<VectorBox>();
    private List<VectorBox> furthestOne = new ArrayList<VectorBox>();
    private List<VectorBox> furthestOther = new ArrayList<VectorBox>();

    private List<SettingsBox> bestClosestSettings = new ArrayList<SettingsBox>();
    private List<SettingsBox> bestFurthestSettings = new ArrayList<SettingsBox>();
    private SimilaritySettingsBox closestSimilaritySettings;
    private SimilaritySettingsBox furthestSimilaritySettings;
    private List<BestSettingsBox> bestPredictionSettings;
    private ListHelper l = new ListHelper();

    public OneVsOtherBox() {
    }

    public OneVsOtherBox(List<VectorBox> data, String string) {
	separateLabels(data, string);
    }

    private void separateLabels(List<VectorBox> list, String label) {
	oneLabel = label;
	one = new ArrayList<VectorBox>();
	other = new ArrayList<VectorBox>();
	for (int i = 0; i < list.size(); i++) {
	    VectorBox vector = list.get(i);
	    if (vector.getNominalLabel().equals(label) || vector.getNumericLabel() == l.parse(label)) {
		one.add(vector);
	    } else {
		other.add(vector);
	    }
	}
    }

    public List<VectorBox> getOne() {
	return one;
    }

    public void setOne(List<VectorBox> one) {
	this.one = one;
    }

    public List<VectorBox> getOther() {
	return other;
    }

    public void setOther(List<VectorBox> other) {
	this.other = other;
    }

    public List<VectorBox> getClosestOne() {
	return closestOne;
    }

    public void setClosestOne(List<VectorBox> closestOne) {
	this.closestOne = closestOne;
    }

    public List<VectorBox> getClosestOther() {
	return closestOther;
    }

    public void setClosestOther(List<VectorBox> closestOther) {
	this.closestOther = closestOther;
    }

    public List<VectorBox> getFurthestOne() {
	return furthestOne;
    }

    public void setFurthestOne(List<VectorBox> furthestOne) {
	this.furthestOne = furthestOne;
    }

    public List<VectorBox> getFurthestOther() {
	return furthestOther;
    }

    public void setFurthestOther(List<VectorBox> furthestOther) {
	this.furthestOther = furthestOther;
    }

    public void setBestClosestSettings(List<SettingsBox> bestClosestSettings) {
	this.bestClosestSettings = bestClosestSettings;
    }

    public void setBestFurthestSettings(List<SettingsBox> bestFurthestSettings) {
	this.bestFurthestSettings = bestFurthestSettings;
    }

    public List<SettingsBox> getBestClosestSettings() {
	return bestClosestSettings;
    }

    public List<SettingsBox> getBestFurthestSettings() {
	return bestFurthestSettings;
    }

    public String getOneLabel() {
	return oneLabel;
    }

    public void setOneLabel(String oneLabel) {
	this.oneLabel = oneLabel;
    }

    public String getOtherLabel() {
	return otherLabel;
    }

    public void setOtherLabel(String otherLabel) {
	this.otherLabel = otherLabel;
    }

    public SimilaritySettingsBox getClosestSimilaritySettings() {
	return closestSimilaritySettings;
    }

    public void setClosestSimilaritySettings(SimilaritySettingsBox closestSimilaritySettings) {
	this.closestSimilaritySettings = closestSimilaritySettings;
    }

    public SimilaritySettingsBox getFurthestSimilaritySettings() {
	return furthestSimilaritySettings;
    }

    public void setFurthestSimilaritySettings(SimilaritySettingsBox furthestSimilaritySettings) {
	this.furthestSimilaritySettings = furthestSimilaritySettings;
    }

    public void setBestPredictSettings(List<BestSettingsBox> bestPredictionSettings) {
	this.bestPredictionSettings = bestPredictionSettings;
    }

    public List<BestSettingsBox> getBestPredictSettings() {
	return bestPredictionSettings;
    }
}
