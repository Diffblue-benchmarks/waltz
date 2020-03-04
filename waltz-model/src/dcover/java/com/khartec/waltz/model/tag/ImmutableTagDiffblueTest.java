package com.khartec.waltz.model.tag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTagDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTag.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableTag.Json()).tagUsages.size());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTag.copyOf(new ImmutableTag.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTag.fromJson(new ImmutableTag.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableTag.Builder builderResult = ImmutableTag.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableTag.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableTag.Builder builderResult = ImmutableTag.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableTag.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableTag.Builder builderResult = ImmutableTag.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableTag.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTag.Json()).id();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTag.Json()).name();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableTag.Json json = new ImmutableTag.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setTagUsagesTest() {
    // Arrange
    ImmutableTag.Json json = new ImmutableTag.Json();
    HashSet<TagUsage> tagUsageSet = new HashSet<TagUsage>();
    tagUsageSet.add(new ImmutableTagUsage.Json());

    // Act
    json.setTagUsages(tagUsageSet);

    // Assert
    assertSame(tagUsageSet, json.tagUsages);
  }

  @Test
  public void setTargetKindTest() {
    // Arrange
    ImmutableTag.Json json = new ImmutableTag.Json();

    // Act
    json.setTargetKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.targetKind);
  }

  @Test
  public void tagUsagesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTag.Json()).tagUsages();
  }

  @Test
  public void targetKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTag.Json()).targetKind();
  }
}

