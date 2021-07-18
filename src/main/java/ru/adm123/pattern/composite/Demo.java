package ru.adm123.pattern.composite;

import ru.adm123.pattern.composite.model.Item;
import ru.adm123.pattern.composite.model.ItemBranch;
import ru.adm123.pattern.composite.model.ItemKnot;
import ru.adm123.pattern.composite.model.ItemSheet;

/**
 * @author Dmitry Ushakov at 18.07.2021
 */
public class Demo {

    public static void main(String[] args) {
        Item rootBranch = new ItemBranch("root");
        ItemBranch branch_1 = new ItemBranch("branch_1");
        ItemBranch branch_1_1 = new ItemBranch("branch_1_1");
        ItemBranch branch_1_2 = new ItemBranch("branch_1_2");
        ItemKnot knot_1_2_1 = new ItemKnot("knot_1_2_1");
        ItemSheet sheet_1_2_1_1 = new ItemSheet("sheet_1_2_1_1");
        ItemSheet sheet_1_2_1_2 = new ItemSheet("sheet_1_2_1_2");
        knot_1_2_1.addChildren(sheet_1_2_1_1, sheet_1_2_1_2);
        ItemKnot knot_1_2_2 = new ItemKnot("knot_1_2_2");
        branch_1_2.addChildren(knot_1_2_1, knot_1_2_2);
        ItemBranch branch_1_3 = new ItemBranch("branch_1_3");
        branch_1.addChildren(branch_1_1, branch_1_2, branch_1_3);
        ItemBranch branch_2 = new ItemBranch("branch_2");
        ItemBranch branch_2_1 = new ItemBranch("branch_2_1");
        ItemBranch branch_2_2 = new ItemBranch("branch_2_2");
        ItemBranch branch_2_3 = new ItemBranch("branch_2_3");
        branch_2.addChildren(branch_2_1, branch_2_2, branch_2_3);
        ItemBranch branch_3 = new ItemBranch("branch_3");
        ItemBranch branch_3_1 = new ItemBranch("branch_3_1");
        ItemBranch branch_3_2 = new ItemBranch("branch_3_2");
        ItemSheet sheet_3_2_1 = new ItemSheet("sheet_3_2_1");
        ItemSheet sheet_3_2_2 = new ItemSheet("sheet_3_2_2");
        branch_3_2.addChildren(sheet_3_2_1, sheet_3_2_2);
        ItemBranch branch_3_3 = new ItemBranch("branch_3_3");
        branch_3.addChildren(branch_3_1, branch_3_2, branch_3_3);
        rootBranch.addChildren(branch_1, branch_2, branch_3);
        rootBranch.print();
    }

}
