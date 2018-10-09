package seedu.address.model.template;

import seedu.address.model.tag.Tag;

public class ResumeSection {
    private String title;
    private String category;
    private String[] tags;

    public ResumeSection(String title, String category, String[] tags) {
        this.title = title;
        this.category = category;
        this.tags = tags;
    }
}
