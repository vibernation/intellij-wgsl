// This is a generated file. Not intended for manual editing.
package wgslplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static wgslplugin.language.psi.WGSLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import wgslplugin.language.psi.*;

public class WGSLForInitImpl extends ASTWrapperPsiElement implements WGSLForInit {

  public WGSLForInitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitForInit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WGSLAssignmentStatement getAssignmentStatement() {
    return findChildByClass(WGSLAssignmentStatement.class);
  }

  @Override
  @Nullable
  public WGSLFuncCallStatement getFuncCallStatement() {
    return findChildByClass(WGSLFuncCallStatement.class);
  }

  @Override
  @Nullable
  public WGSLVariableStatement getVariableStatement() {
    return findChildByClass(WGSLVariableStatement.class);
  }

}
