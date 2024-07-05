/**
 * generated by Xtext 2.30.0
 */
package es.us.isa.idl.idl.impl;

import es.us.isa.idl.idl.GeneralPredefinedDependency;
import es.us.isa.idl.idl.GeneralPredicate;
import es.us.isa.idl.idl.IdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Predefined Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.idl.idl.impl.GeneralPredefinedDependencyImpl#getNot <em>Not</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.GeneralPredefinedDependencyImpl#getPredefDepType <em>Predef Dep Type</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.GeneralPredefinedDependencyImpl#getPredefDepElements <em>Predef Dep Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralPredefinedDependencyImpl extends MinimalEObjectImpl.Container implements GeneralPredefinedDependency
{
  /**
   * The default value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected static final String NOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected String not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #getPredefDepType() <em>Predef Dep Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefDepType()
   * @generated
   * @ordered
   */
  protected static final String PREDEF_DEP_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredefDepType() <em>Predef Dep Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefDepType()
   * @generated
   * @ordered
   */
  protected String predefDepType = PREDEF_DEP_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredefDepElements() <em>Predef Dep Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefDepElements()
   * @generated
   * @ordered
   */
  protected EList<GeneralPredicate> predefDepElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralPredefinedDependencyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IdlPackage.Literals.GENERAL_PREDEFINED_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(String newNot)
  {
    String oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPredefDepType()
  {
    return predefDepType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredefDepType(String newPredefDepType)
  {
    String oldPredefDepType = predefDepType;
    predefDepType = newPredefDepType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE, oldPredefDepType, predefDepType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GeneralPredicate> getPredefDepElements()
  {
    if (predefDepElements == null)
    {
      predefDepElements = new EObjectContainmentEList<GeneralPredicate>(GeneralPredicate.class, this, IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS);
    }
    return predefDepElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS:
        return ((InternalEList<?>)getPredefDepElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__NOT:
        return getNot();
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE:
        return getPredefDepType();
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS:
        return getPredefDepElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__NOT:
        setNot((String)newValue);
        return;
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE:
        setPredefDepType((String)newValue);
        return;
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS:
        getPredefDepElements().clear();
        getPredefDepElements().addAll((Collection<? extends GeneralPredicate>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE:
        setPredefDepType(PREDEF_DEP_TYPE_EDEFAULT);
        return;
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS:
        getPredefDepElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__NOT:
        return NOT_EDEFAULT == null ? not != null : !NOT_EDEFAULT.equals(not);
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE:
        return PREDEF_DEP_TYPE_EDEFAULT == null ? predefDepType != null : !PREDEF_DEP_TYPE_EDEFAULT.equals(predefDepType);
      case IdlPackage.GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS:
        return predefDepElements != null && !predefDepElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (not: ");
    result.append(not);
    result.append(", predefDepType: ");
    result.append(predefDepType);
    result.append(')');
    return result.toString();
  }

} //GeneralPredefinedDependencyImpl
