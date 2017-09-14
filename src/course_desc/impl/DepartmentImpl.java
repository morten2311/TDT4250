/**
 */
package course_desc.impl;

import course_desc.CourseInstance;
import course_desc.Course_descPackage;
import course_desc.Department;
import course_desc.StudyProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.DepartmentImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link course_desc.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.impl.DepartmentImpl#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> responsible;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> manages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getResponsible() {
		if (responsible == null) {
			responsible = new EObjectContainmentWithInverseEList<CourseInstance>(CourseInstance.class, this, Course_descPackage.DEPARTMENT__RESPONSIBLE, Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF);
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getManages() {
		if (manages == null) {
			manages = new EObjectContainmentWithInverseEList<StudyProgram>(StudyProgram.class, this, Course_descPackage.DEPARTMENT__MANAGES, Course_descPackage.STUDY_PROGRAM__BELONGS);
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsible()).basicAdd(otherEnd, msgs);
			case Course_descPackage.DEPARTMENT__MANAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				return ((InternalEList<?>)getResponsible()).basicRemove(otherEnd, msgs);
			case Course_descPackage.DEPARTMENT__MANAGES:
				return ((InternalEList<?>)getManages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				return getResponsible();
			case Course_descPackage.DEPARTMENT__NAME:
				return getName();
			case Course_descPackage.DEPARTMENT__MANAGES:
				return getManages();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				getResponsible().clear();
				getResponsible().addAll((Collection<? extends CourseInstance>)newValue);
				return;
			case Course_descPackage.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case Course_descPackage.DEPARTMENT__MANAGES:
				getManages().clear();
				getManages().addAll((Collection<? extends StudyProgram>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				getResponsible().clear();
				return;
			case Course_descPackage.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Course_descPackage.DEPARTMENT__MANAGES:
				getManages().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.DEPARTMENT__RESPONSIBLE:
				return responsible != null && !responsible.isEmpty();
			case Course_descPackage.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Course_descPackage.DEPARTMENT__MANAGES:
				return manages != null && !manages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
