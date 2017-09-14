/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.CourseInstance;
import course_desc.CoursePreconditions;
import course_desc.Course_descPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link course_desc.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.impl.CourseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link course_desc.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link course_desc.impl.CourseImpl#getHasInstance <em>Has Instance</em>}</li>
 *   <li>{@link course_desc.impl.CourseImpl#getHasPrecondition <em>Has Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final Double CREDITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected Double credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasInstance() <em>Has Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> hasInstance;

	/**
	 * The cached value of the '{@link #getHasPrecondition() <em>Has Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CoursePreconditions> hasPrecondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(Double newCredits) {
		Double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getHasInstance() {
		if (hasInstance == null) {
			hasInstance = new EObjectWithInverseResolvingEList<CourseInstance>(CourseInstance.class, this, Course_descPackage.COURSE__HAS_INSTANCE, Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE);
		}
		return hasInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoursePreconditions> getHasPrecondition() {
		if (hasPrecondition == null) {
			hasPrecondition = new EObjectResolvingEList<CoursePreconditions>(CoursePreconditions.class, this, Course_descPackage.COURSE__HAS_PRECONDITION);
		}
		return hasPrecondition;
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
			case Course_descPackage.COURSE__HAS_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInstance()).basicAdd(otherEnd, msgs);
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
			case Course_descPackage.COURSE__HAS_INSTANCE:
				return ((InternalEList<?>)getHasInstance()).basicRemove(otherEnd, msgs);
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
			case Course_descPackage.COURSE__CODE:
				return getCode();
			case Course_descPackage.COURSE__NAME:
				return getName();
			case Course_descPackage.COURSE__CONTENT:
				return getContent();
			case Course_descPackage.COURSE__CREDITS:
				return getCredits();
			case Course_descPackage.COURSE__HAS_INSTANCE:
				return getHasInstance();
			case Course_descPackage.COURSE__HAS_PRECONDITION:
				return getHasPrecondition();
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
			case Course_descPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case Course_descPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case Course_descPackage.COURSE__CONTENT:
				setContent((String)newValue);
				return;
			case Course_descPackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
			case Course_descPackage.COURSE__HAS_INSTANCE:
				getHasInstance().clear();
				getHasInstance().addAll((Collection<? extends CourseInstance>)newValue);
				return;
			case Course_descPackage.COURSE__HAS_PRECONDITION:
				getHasPrecondition().clear();
				getHasPrecondition().addAll((Collection<? extends CoursePreconditions>)newValue);
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
			case Course_descPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Course_descPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Course_descPackage.COURSE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Course_descPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case Course_descPackage.COURSE__HAS_INSTANCE:
				getHasInstance().clear();
				return;
			case Course_descPackage.COURSE__HAS_PRECONDITION:
				getHasPrecondition().clear();
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
			case Course_descPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Course_descPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Course_descPackage.COURSE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Course_descPackage.COURSE__CREDITS:
				return CREDITS_EDEFAULT == null ? credits != null : !CREDITS_EDEFAULT.equals(credits);
			case Course_descPackage.COURSE__HAS_INSTANCE:
				return hasInstance != null && !hasInstance.isEmpty();
			case Course_descPackage.COURSE__HAS_PRECONDITION:
				return hasPrecondition != null && !hasPrecondition.isEmpty();
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
		result.append(" (Code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", Content: ");
		result.append(content);
		result.append(", Credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
